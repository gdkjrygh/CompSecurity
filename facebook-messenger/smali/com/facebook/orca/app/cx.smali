.class Lcom/facebook/orca/app/cx;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/ac;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 995
    iput-object p1, p0, Lcom/facebook/orca/app/cx;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 995
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/cx;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/ac;
    .locals 6

    .prologue
    .line 1000
    new-instance v0, Lcom/facebook/orca/f/ac;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/cx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v2, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/cx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/f/k;

    const-class v3, Lcom/facebook/orca/f/z;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/cx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/f/z;

    const-class v4, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/cx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/common/e/h;

    const-class v5, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/cx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/f/ac;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/f/k;Lcom/facebook/orca/f/z;Lcom/facebook/common/e/h;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 995
    invoke-virtual {p0}, Lcom/facebook/orca/app/cx;->a()Lcom/facebook/orca/f/ac;

    move-result-object v0

    return-object v0
.end method
