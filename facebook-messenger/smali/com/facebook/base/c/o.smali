.class Lcom/facebook/base/c/o;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Landroid/content/ContentResolver;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 577
    iput-object p1, p0, Lcom/facebook/base/c/o;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 577
    invoke-direct {p0, p1}, Lcom/facebook/base/c/o;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/content/ContentResolver;
    .locals 1

    .prologue
    .line 581
    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 577
    invoke-virtual {p0}, Lcom/facebook/base/c/o;->a()Landroid/content/ContentResolver;

    move-result-object v0

    return-object v0
.end method
