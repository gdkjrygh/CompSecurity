.class public Lcom/facebook/inject/a/f;
.super Ljava/lang/Object;
.source "LinkedModuleBuilderImpl.java"

# interfaces
.implements Lcom/facebook/inject/a/e;


# instance fields
.field private final a:Lcom/facebook/inject/r;


# direct methods
.method public constructor <init>(Lcom/facebook/inject/r;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/facebook/inject/a/f;->a:Lcom/facebook/inject/r;

    .line 19
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/inject/a/f;
    .locals 2

    .prologue
    .line 29
    iget-object v0, p0, Lcom/facebook/inject/a/f;->a:Lcom/facebook/inject/r;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/inject/r;->a(Z)V

    .line 30
    return-object p0
.end method
