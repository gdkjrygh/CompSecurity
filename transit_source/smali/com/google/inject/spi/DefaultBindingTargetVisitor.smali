.class public abstract Lcom/google/inject/spi/DefaultBindingTargetVisitor;
.super Ljava/lang/Object;
.source "DefaultBindingTargetVisitor.java"

# interfaces
.implements Lcom/google/inject/spi/BindingTargetVisitor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/spi/BindingTargetVisitor",
        "<TT;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    .local p0, "this":Lcom/google/inject/spi/DefaultBindingTargetVisitor;, "Lcom/google/inject/spi/DefaultBindingTargetVisitor<TT;TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public visit(Lcom/google/inject/spi/ConstructorBinding;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ConstructorBinding",
            "<+TT;>;)TV;"
        }
    .end annotation

    .prologue
    .line 65
    .local p0, "this":Lcom/google/inject/spi/DefaultBindingTargetVisitor;, "Lcom/google/inject/spi/DefaultBindingTargetVisitor<TT;TV;>;"
    .local p1, "constructorBinding":Lcom/google/inject/spi/ConstructorBinding;, "Lcom/google/inject/spi/ConstructorBinding<+TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/spi/DefaultBindingTargetVisitor;->visitOther(Lcom/google/inject/Binding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/ConvertedConstantBinding;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ConvertedConstantBinding",
            "<+TT;>;)TV;"
        }
    .end annotation

    .prologue
    .line 69
    .local p0, "this":Lcom/google/inject/spi/DefaultBindingTargetVisitor;, "Lcom/google/inject/spi/DefaultBindingTargetVisitor<TT;TV;>;"
    .local p1, "convertedConstantBinding":Lcom/google/inject/spi/ConvertedConstantBinding;, "Lcom/google/inject/spi/ConvertedConstantBinding<+TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/spi/DefaultBindingTargetVisitor;->visitOther(Lcom/google/inject/Binding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/ExposedBinding;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ExposedBinding",
            "<+TT;>;)TV;"
        }
    .end annotation

    .prologue
    .line 57
    .local p0, "this":Lcom/google/inject/spi/DefaultBindingTargetVisitor;, "Lcom/google/inject/spi/DefaultBindingTargetVisitor<TT;TV;>;"
    .local p1, "exposedBinding":Lcom/google/inject/spi/ExposedBinding;, "Lcom/google/inject/spi/ExposedBinding<+TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/spi/DefaultBindingTargetVisitor;->visitOther(Lcom/google/inject/Binding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/InstanceBinding;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/InstanceBinding",
            "<+TT;>;)TV;"
        }
    .end annotation

    .prologue
    .line 41
    .local p0, "this":Lcom/google/inject/spi/DefaultBindingTargetVisitor;, "Lcom/google/inject/spi/DefaultBindingTargetVisitor<TT;TV;>;"
    .local p1, "instanceBinding":Lcom/google/inject/spi/InstanceBinding;, "Lcom/google/inject/spi/InstanceBinding<+TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/spi/DefaultBindingTargetVisitor;->visitOther(Lcom/google/inject/Binding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/LinkedKeyBinding;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/LinkedKeyBinding",
            "<+TT;>;)TV;"
        }
    .end annotation

    .prologue
    .line 53
    .local p0, "this":Lcom/google/inject/spi/DefaultBindingTargetVisitor;, "Lcom/google/inject/spi/DefaultBindingTargetVisitor<TT;TV;>;"
    .local p1, "linkedKeyBinding":Lcom/google/inject/spi/LinkedKeyBinding;, "Lcom/google/inject/spi/LinkedKeyBinding<+TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/spi/DefaultBindingTargetVisitor;->visitOther(Lcom/google/inject/Binding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/ProviderBinding;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ProviderBinding",
            "<+TT;>;)TV;"
        }
    .end annotation

    .prologue
    .line 75
    .local p0, "this":Lcom/google/inject/spi/DefaultBindingTargetVisitor;, "Lcom/google/inject/spi/DefaultBindingTargetVisitor<TT;TV;>;"
    .local p1, "providerBinding":Lcom/google/inject/spi/ProviderBinding;, "Lcom/google/inject/spi/ProviderBinding<+TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/spi/DefaultBindingTargetVisitor;->visitOther(Lcom/google/inject/Binding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/ProviderInstanceBinding;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ProviderInstanceBinding",
            "<+TT;>;)TV;"
        }
    .end annotation

    .prologue
    .line 45
    .local p0, "this":Lcom/google/inject/spi/DefaultBindingTargetVisitor;, "Lcom/google/inject/spi/DefaultBindingTargetVisitor<TT;TV;>;"
    .local p1, "providerInstanceBinding":Lcom/google/inject/spi/ProviderInstanceBinding;, "Lcom/google/inject/spi/ProviderInstanceBinding<+TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/spi/DefaultBindingTargetVisitor;->visitOther(Lcom/google/inject/Binding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/ProviderKeyBinding;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/ProviderKeyBinding",
            "<+TT;>;)TV;"
        }
    .end annotation

    .prologue
    .line 49
    .local p0, "this":Lcom/google/inject/spi/DefaultBindingTargetVisitor;, "Lcom/google/inject/spi/DefaultBindingTargetVisitor<TT;TV;>;"
    .local p1, "providerKeyBinding":Lcom/google/inject/spi/ProviderKeyBinding;, "Lcom/google/inject/spi/ProviderKeyBinding<+TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/spi/DefaultBindingTargetVisitor;->visitOther(Lcom/google/inject/Binding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/UntargettedBinding;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/UntargettedBinding",
            "<+TT;>;)TV;"
        }
    .end annotation

    .prologue
    .line 61
    .local p0, "this":Lcom/google/inject/spi/DefaultBindingTargetVisitor;, "Lcom/google/inject/spi/DefaultBindingTargetVisitor<TT;TV;>;"
    .local p1, "untargettedBinding":Lcom/google/inject/spi/UntargettedBinding;, "Lcom/google/inject/spi/UntargettedBinding<+TT;>;"
    invoke-virtual {p0, p1}, Lcom/google/inject/spi/DefaultBindingTargetVisitor;->visitOther(Lcom/google/inject/Binding;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected visitOther(Lcom/google/inject/Binding;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Binding",
            "<+TT;>;)TV;"
        }
    .end annotation

    .prologue
    .line 37
    .local p0, "this":Lcom/google/inject/spi/DefaultBindingTargetVisitor;, "Lcom/google/inject/spi/DefaultBindingTargetVisitor<TT;TV;>;"
    .local p1, "binding":Lcom/google/inject/Binding;, "Lcom/google/inject/Binding<+TT;>;"
    const/4 v0, 0x0

    return-object v0
.end method
