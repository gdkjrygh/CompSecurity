.class Lcom/facebook/orca/push/f;
.super Lcom/facebook/inject/d;
.source "MessagesPushModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/push/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/push/c;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/push/c;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/facebook/orca/push/f;->a:Lcom/facebook/orca/push/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/push/c;Lcom/facebook/orca/push/d;)V
    .locals 0

    .prologue
    .line 92
    invoke-direct {p0, p1}, Lcom/facebook/orca/push/f;-><init>(Lcom/facebook/orca/push/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/push/h;
    .locals 3

    .prologue
    .line 96
    new-instance v1, Lcom/facebook/orca/push/h;

    invoke-virtual {p0}, Lcom/facebook/orca/push/f;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/content/ContentResolver;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentResolver;

    invoke-direct {v1, v0}, Lcom/facebook/orca/push/h;-><init>(Landroid/content/ContentResolver;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/facebook/orca/push/f;->a()Lcom/facebook/orca/push/h;

    move-result-object v0

    return-object v0
.end method
