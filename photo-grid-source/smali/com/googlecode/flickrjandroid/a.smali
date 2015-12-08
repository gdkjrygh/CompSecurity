.class final Lcom/googlecode/flickrjandroid/a;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal",
        "<",
        "Lcom/googlecode/flickrjandroid/RequestContext;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Lcom/googlecode/flickrjandroid/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1072
    new-instance v0, Lcom/googlecode/flickrjandroid/RequestContext;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/RequestContext;-><init>()V

    .line 1
    return-object v0
.end method
