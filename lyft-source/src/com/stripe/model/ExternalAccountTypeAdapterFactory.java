// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

// Referenced classes of package com.stripe.model:
//            ExternalAccount, AlipayAccount, BankAccount, BitcoinReceiver, 
//            Card

public class ExternalAccountTypeAdapterFactory
    implements TypeAdapterFactory
{

    public ExternalAccountTypeAdapterFactory()
    {
    }

    public TypeAdapter create(Gson gson, TypeToken typetoken)
    {
        if (!com/stripe/model/ExternalAccount.isAssignableFrom(typetoken.getRawType()))
        {
            return null;
        } else
        {
            typetoken = gson.a(com/google/gson/JsonElement);
            return (new TypeAdapter() {

                final ExternalAccountTypeAdapterFactory this$0;
                final TypeAdapter val$alipayAccountAdapter;
                final TypeAdapter val$bankAccountAdapter;
                final TypeAdapter val$bitcoinReceiverAdapter;
                final TypeAdapter val$cardAdapter;
                final TypeAdapter val$elementAdapter;
                final TypeAdapter val$externalAccountAdapter;

                public ExternalAccount read(JsonReader jsonreader)
                {
                    jsonreader = ((JsonElement)elementAdapter.read(jsonreader)).l();
                    String s = jsonreader.c("object").c();
                    if (s.equals("alipay_account"))
                    {
                        return (ExternalAccount)alipayAccountAdapter.fromJsonTree(jsonreader);
                    }
                    if (s.equals("bank_account"))
                    {
                        return (ExternalAccount)bankAccountAdapter.fromJsonTree(jsonreader);
                    }
                    if (s.equals("bitcoin_receiver"))
                    {
                        return (ExternalAccount)bitcoinReceiverAdapter.fromJsonTree(jsonreader);
                    }
                    if (s.equals("card"))
                    {
                        return (ExternalAccount)cardAdapter.fromJsonTree(jsonreader);
                    } else
                    {
                        return (ExternalAccount)externalAccountAdapter.fromJsonTree(jsonreader);
                    }
                }

                public volatile Object read(JsonReader jsonreader)
                {
                    return read(jsonreader);
                }

                public void write(JsonWriter jsonwriter, ExternalAccount externalaccount)
                {
                    externalAccountAdapter.write(jsonwriter, externalaccount);
                }

                public volatile void write(JsonWriter jsonwriter, Object obj)
                {
                    write(jsonwriter, (ExternalAccount)obj);
                }

            
            {
                this$0 = ExternalAccountTypeAdapterFactory.this;
                externalAccountAdapter = typeadapter;
                elementAdapter = typeadapter1;
                alipayAccountAdapter = typeadapter2;
                bankAccountAdapter = typeadapter3;
                bitcoinReceiverAdapter = typeadapter4;
                cardAdapter = typeadapter5;
                super();
            }
            }).nullSafe();
        }
    }
}
