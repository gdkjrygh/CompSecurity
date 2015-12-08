.class public interface abstract Lcom/squareup/okhttp/Response$Receiver;
.super Ljava/lang/Object;
.source "Response.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/Response;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Receiver"
.end annotation


# virtual methods
.method public abstract onFailure(Lcom/squareup/okhttp/Failure;)V
.end method

.method public abstract onResponse(Lcom/squareup/okhttp/Response;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
