.class Lcom/facebook/contacts/t;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/upload/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 688
    iput-object p1, p0, Lcom/facebook/contacts/t;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 688
    invoke-direct {p0, p1}, Lcom/facebook/contacts/t;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/upload/c;
    .locals 5

    .prologue
    .line 692
    new-instance v4, Lcom/facebook/contacts/upload/c;

    const-class v0, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/ops/k;

    const-class v1, Landroid/support/v4/a/e;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/support/v4/a/e;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v3, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v3}, Lcom/facebook/contacts/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/analytics/av;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/contacts/upload/c;-><init>(Lcom/facebook/fbservice/ops/k;Landroid/support/v4/a/e;Lcom/facebook/prefs/shared/d;Lcom/facebook/analytics/av;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 688
    invoke-virtual {p0}, Lcom/facebook/contacts/t;->a()Lcom/facebook/contacts/upload/c;

    move-result-object v0

    return-object v0
.end method
