.class Lcom/facebook/contacts/c;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/service/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 346
    iput-object p1, p0, Lcom/facebook/contacts/c;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 346
    invoke-direct {p0, p1}, Lcom/facebook/contacts/c;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/service/a;
    .locals 3

    .prologue
    .line 351
    new-instance v2, Lcom/facebook/contacts/service/a;

    invoke-virtual {p0}, Lcom/facebook/contacts/c;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/ContentResolver;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentResolver;

    const-class v1, Lcom/facebook/contacts/data/a;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/data/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/contacts/service/a;-><init>(Landroid/content/ContentResolver;Lcom/facebook/contacts/data/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 346
    invoke-virtual {p0}, Lcom/facebook/contacts/c;->a()Lcom/facebook/contacts/service/a;

    move-result-object v0

    return-object v0
.end method
