.class public interface abstract Lcom/googlecode/flickrjandroid/Response;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getData()Lorg/json/JSONObject;
.end method

.method public abstract getErrorCode()Ljava/lang/String;
.end method

.method public abstract getErrorMessage()Ljava/lang/String;
.end method

.method public abstract getRawResponse()Ljava/lang/String;
.end method

.method public abstract isError()Z
.end method

.method public abstract parse(Ljava/lang/String;)V
.end method
