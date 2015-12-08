// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Module;
import com.google.inject.Stage;
import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.internal.util.$Stopwatch;
import com.google.inject.spi.Elements;
import com.google.inject.spi.PrivateElements;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.inject.internal:
//            InjectorShell, InheritingState, State, InjectorOptionsProcessor, 
//            InjectorImpl, PrivateElementsImpl, TypeConverterBindingProcessor, MessageProcessor, 
//            TypeListenerBindingProcessor, MembersInjectorStore, ScopeBindingProcessor, BindingProcessor, 
//            UntargettedBindingProcessor, PrivateElementProcessor, Initializer, ProcessedBindingData, 
//            Errors

static class ptions
{

    private final List elements = $Lists.newArrayList();
    private final List modules = $Lists.newArrayList();
    private ptions options;
    private InjectorImpl parent;
    private PrivateElementsImpl privateElements;
    private Stage stage;
    private State state;

    private State getState()
    {
        if (state == null)
        {
            state = new InheritingState(State.NONE);
        }
        return state;
    }

    void addModules(Iterable iterable)
    {
        Module module;
        for (iterable = iterable.iterator(); iterable.hasNext(); modules.add(module))
        {
            module = (Module)iterable.next();
        }

    }

    List build(Initializer initializer, ProcessedBindingData processedbindingdata, $Stopwatch $stopwatch, Errors errors)
    {
        Object obj;
        InjectorImpl injectorimpl;
        PrivateElementProcessor privateelementprocessor;
        boolean flag;
        if (stage != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "Stage not initialized");
        if (privateElements == null || parent != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "PrivateElements with no parent");
        if (state != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "no state. Did you remember to lock() ?");
        if (parent == null)
        {
            modules.add(0, new le(stage, null));
        }
        elements.addAll(Elements.getElements(stage, modules));
        obj = new InjectorOptionsProcessor(errors);
        ((InjectorOptionsProcessor) (obj)).process(null, elements);
        options = ((InjectorOptionsProcessor) (obj)).getOptions(stage, options);
        injectorimpl = new InjectorImpl(parent, state, options);
        if (privateElements != null)
        {
            privateElements.initInjector(injectorimpl);
        }
        if (parent == null)
        {
            (new TypeConverterBindingProcessor(errors)).prepareBuiltInConverters(injectorimpl);
        }
        $stopwatch.resetAndLog("Module execution");
        (new MessageProcessor(errors)).process(injectorimpl, elements);
        (new TypeListenerBindingProcessor(errors)).process(injectorimpl, elements);
        injectorimpl.membersInjectorStore = new MembersInjectorStore(injectorimpl, injectorimpl.state.getTypeListenerBindings());
        $stopwatch.resetAndLog("TypeListeners creation");
        (new ScopeBindingProcessor(errors)).process(injectorimpl, elements);
        $stopwatch.resetAndLog("Scopes creation");
        (new TypeConverterBindingProcessor(errors)).process(injectorimpl, elements);
        $stopwatch.resetAndLog("Converters creation");
        InjectorShell.access$100(injectorimpl);
        InjectorShell.access$200(injectorimpl);
        (new BindingProcessor(errors, initializer, processedbindingdata)).process(injectorimpl, elements);
        (new UntargettedBindingProcessor(errors, processedbindingdata)).process(injectorimpl, elements);
        $stopwatch.resetAndLog("Binding creation");
        obj = $Lists.newArrayList();
        ((List) (obj)).add(new InjectorShell(this, elements, injectorimpl, null));
        privateelementprocessor = new PrivateElementProcessor(errors);
        privateelementprocessor.process(injectorimpl, elements);
        for (Iterator iterator = privateelementprocessor.getInjectorShellBuilders().iterator(); iterator.hasNext(); ((List) (obj)).addAll(((r.getInjectorShellBuilders)iterator.next()).build(initializer, processedbindingdata, $stopwatch, errors))) { }
        $stopwatch.resetAndLog("Private environment creation");
        return ((List) (obj));
    }

    Stage getStage()
    {
        return options.stage;
    }

    Object lock()
    {
        return getState().lock();
    }

    getState parent(InjectorImpl injectorimpl)
    {
        parent = injectorimpl;
        state = new InheritingState(injectorimpl.state);
        options = injectorimpl.options;
        stage = options.stage;
        return this;
    }

    ptions.stage privateElements(PrivateElements privateelements)
    {
        privateElements = (PrivateElementsImpl)privateelements;
        elements.addAll(privateelements.getElements());
        return this;
    }

     stage(Stage stage1)
    {
        stage = stage1;
        return this;
    }

    ptions()
    {
    }
}
