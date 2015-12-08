.class public interface abstract Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/List",
        "<TT;>;"
    }
.end annotation


# virtual methods
.method public abstract castToListOf(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/Class",
            "<TU;>;)",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList",
            "<TU;>;"
        }
    .end annotation
.end method

.method public abstract getInnerJSONArray()Lorg/json/JSONArray;
.end method
