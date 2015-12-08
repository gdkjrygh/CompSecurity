// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.stripe.model:
//            ExternalAccountTypeAdapterFactory, ExternalAccount

class val.cardAdapter extends TypeAdapter
{

    final ExternalAccountTypeAdapterFactory this$0;
    final TypeAdapter val$alipayAccountAdapter;
    final TypeAdapter val$bankAccountAdapter;
    final TypeAdapter val$bitcoinReceiverAdapter;
    final TypeAdapter val$cardAdapter;
    final TypeAdapter val$elementAdapter;
    final TypeAdapter val$externalAccountAdapter;

    public ExternalAccount read(JsonReader jsonreader)
    {
        jsonreader = ((JsonElement)val$elementAdapter.read(jsonreader)).l();
        String s = jsonreader.c("object").c();
        if (s.equals("alipay_account"))
        {
            return (ExternalAccount)val$alipayAccountAdapter.fromJsonTree(jsonreader);
        }
        if (s.equals("bank_account"))
        {
            return (ExternalAccount)val$bankAccountAdapter.fromJsonTree(jsonreader);
        }
        if (s.equals("bitcoin_receiver"))
        {
            return (ExternalAccount)val$bitcoinReceiverAdapter.fromJsonTree(jsonreader);
        }
        if (s.equals("card"))
        {
            return (ExternalAccount)val$cardAdapter.fromJsonTree(jsonreader);
        } else
        {
            return (ExternalAccount)val$externalAccountAdapter.fromJsonTree(jsonreader);
        }
    }

    public volatile Object read(JsonReader jsonreader)
    {
        return read(jsonreader);
    }

    public void write(JsonWriter jsonwriter, ExternalAccount externalaccount)
    {
        val$externalAccountAdapter.write(jsonwriter, externalaccount);
    }

    public volatile void write(JsonWriter jsonwriter, Object obj)
    {
        write(jsonwriter, (ExternalAccount)obj);
    }

    ()
    {
        this$0 = final_externalaccounttypeadapterfactory;
        val$externalAccountAdapter = typeadapter;
        val$elementAdapter = typeadapter1;
        val$alipayAccountAdapter = typeadapter2;
        val$bankAccountAdapter = typeadapter3;
        val$bitcoinReceiverAdapter = typeadapter4;
        val$cardAdapter = TypeAdapter.this;
        super();
    }
}
