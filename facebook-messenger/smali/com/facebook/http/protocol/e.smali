.class public Lcom/facebook/http/protocol/e;
.super Ljava/io/IOException;
.source "ApiException.java"

# interfaces
.implements Lcom/facebook/fbservice/c/c;


# instance fields
.field private final a:Lcom/facebook/http/protocol/ApiErrorResult;


# direct methods
.method public constructor <init>(Lcom/facebook/http/protocol/ApiErrorResult;)V
    .locals 1

    .prologue
    .line 17
    invoke-virtual {p1}, Lcom/facebook/http/protocol/ApiErrorResult;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 18
    iput-object p1, p0, Lcom/facebook/http/protocol/e;->a:Lcom/facebook/http/protocol/ApiErrorResult;

    .line 19
    return-void
.end method


# virtual methods
.method public synthetic a()Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 12
    invoke-virtual {p0}, Lcom/facebook/http/protocol/e;->b()Lcom/facebook/http/protocol/ApiErrorResult;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/facebook/http/protocol/ApiErrorResult;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/http/protocol/e;->a:Lcom/facebook/http/protocol/ApiErrorResult;

    return-object v0
.end method
