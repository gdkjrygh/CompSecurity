.class Lcom/facebook/contacts/j;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 676
    iput-object p1, p0, Lcom/facebook/contacts/j;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 676
    invoke-direct {p0, p1}, Lcom/facebook/contacts/j;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/b/a;
    .locals 3

    .prologue
    .line 681
    new-instance v2, Lcom/facebook/contacts/b/a;

    invoke-virtual {p0}, Lcom/facebook/contacts/j;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/ContentResolver;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentResolver;

    const-class v1, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/analytics/av;

    invoke-direct {v2, v0, v1}, Lcom/facebook/contacts/b/a;-><init>(Landroid/content/ContentResolver;Lcom/facebook/analytics/av;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 676
    invoke-virtual {p0}, Lcom/facebook/contacts/j;->a()Lcom/facebook/contacts/b/a;

    move-result-object v0

    return-object v0
.end method
