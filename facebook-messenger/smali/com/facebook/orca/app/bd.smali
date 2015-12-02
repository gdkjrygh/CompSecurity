.class Lcom/facebook/orca/app/bd;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/common/ui/a/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1085
    iput-object p1, p0, Lcom/facebook/orca/app/bd;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1085
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/bd;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/common/ui/a/b;
    .locals 4

    .prologue
    .line 1089
    new-instance v3, Lcom/facebook/orca/common/ui/a/b;

    const-class v0, Landroid/content/res/Resources;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    const-class v1, Lcom/facebook/orca/share/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/share/a;

    const-class v2, Lcom/facebook/orca/emoji/z;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/bd;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/emoji/z;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/common/ui/a/b;-><init>(Landroid/content/res/Resources;Lcom/facebook/orca/share/a;Lcom/facebook/orca/emoji/z;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1085
    invoke-virtual {p0}, Lcom/facebook/orca/app/bd;->a()Lcom/facebook/orca/common/ui/a/b;

    move-result-object v0

    return-object v0
.end method
