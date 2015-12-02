.class public abstract Lcom/facebook/common/u/b;
.super Ljava/lang/Object;
.source "UriIntentBuilder.java"


# instance fields
.field private a:Lcom/facebook/common/u/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/common/u/c",
            "<",
            "Lcom/facebook/common/uri/UriIntentBuilder$IUriTemplateIntentBuilder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Lcom/facebook/common/u/c;

    invoke-direct {v0}, Lcom/facebook/common/u/c;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/u/b;->a:Lcom/facebook/common/u/c;

    .line 94
    return-void
.end method
