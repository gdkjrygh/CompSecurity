.class Lcom/facebook/orca/app/dk;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/common/ui/titlebar/ap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1859
    iput-object p1, p0, Lcom/facebook/orca/app/dk;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1859
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/dk;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/common/ui/titlebar/ap;
    .locals 8

    .prologue
    .line 1864
    new-instance v0, Lcom/facebook/orca/common/ui/titlebar/ap;

    const-class v1, Lcom/facebook/orca/contacts/divebar/a;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/dk;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/contacts/divebar/a;

    const-class v2, Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/dk;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/contacts/divebar/e;

    const-class v3, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/dk;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/f/k;

    const-class v4, Lcom/facebook/l/k;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/dk;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/l/k;

    const-class v5, Lcom/facebook/c/s;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/dk;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/c/s;

    const-class v6, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/app/dk;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/time/a;

    const-class v7, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v7}, Lcom/facebook/orca/app/dk;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/prefs/shared/d;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/common/ui/titlebar/ap;-><init>(Lcom/facebook/orca/contacts/divebar/a;Lcom/facebook/orca/contacts/divebar/e;Lcom/facebook/orca/f/k;Lcom/facebook/l/k;Lcom/facebook/c/s;Lcom/facebook/common/time/a;Lcom/facebook/prefs/shared/d;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1859
    invoke-virtual {p0}, Lcom/facebook/orca/app/dk;->a()Lcom/facebook/orca/common/ui/titlebar/ap;

    move-result-object v0

    return-object v0
.end method
