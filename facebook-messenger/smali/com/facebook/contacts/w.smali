.class Lcom/facebook/contacts/w;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/e/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 562
    iput-object p1, p0, Lcom/facebook/contacts/w;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 562
    invoke-direct {p0, p1}, Lcom/facebook/contacts/w;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/e/c;
    .locals 4

    .prologue
    .line 567
    new-instance v3, Lcom/facebook/contacts/e/c;

    const-class v0, Landroid/content/ContentResolver;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentResolver;

    const-class v1, Lcom/facebook/contacts/data/a;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/data/a;

    const-class v2, Lcom/facebook/contacts/data/x;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/w;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/contacts/data/x;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/contacts/e/c;-><init>(Landroid/content/ContentResolver;Lcom/facebook/contacts/data/a;Lcom/facebook/contacts/data/x;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 562
    invoke-virtual {p0}, Lcom/facebook/contacts/w;->a()Lcom/facebook/contacts/e/c;

    move-result-object v0

    return-object v0
.end method
