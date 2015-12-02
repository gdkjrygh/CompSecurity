.class public Lcom/facebook/inject/x;
.super Ljava/lang/Object;
.source "FbInjectorImpl.java"

# interfaces
.implements Lcom/facebook/base/c;


# instance fields
.field final synthetic a:Lcom/facebook/inject/u;


# direct methods
.method public constructor <init>(Lcom/facebook/inject/u;)V
    .locals 0

    .prologue
    .line 207
    iput-object p1, p0, Lcom/facebook/inject/x;->a:Lcom/facebook/inject/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 211
    iget-object v0, p0, Lcom/facebook/inject/x;->a:Lcom/facebook/inject/u;

    invoke-static {v0}, Lcom/facebook/inject/u;->a(Lcom/facebook/inject/u;)Lcom/facebook/inject/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/inject/ba;->a()V

    .line 212
    return-void
.end method
