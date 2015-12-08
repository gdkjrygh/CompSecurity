.class public interface abstract Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract asMap()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract cast(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract getInnerJSONObject()Lorg/json/JSONObject;
.end method

.method public abstract getProperty(Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public abstract getPropertyAs(Ljava/lang/String;Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract getPropertyAsList(Ljava/lang/String;Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList",
            "<TT;>;"
        }
    .end annotation
.end method

.method public abstract removeProperty(Ljava/lang/String;)V
.end method

.method public abstract setProperty(Ljava/lang/String;Ljava/lang/Object;)V
.end method
