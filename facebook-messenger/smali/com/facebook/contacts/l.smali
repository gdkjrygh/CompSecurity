.class Lcom/facebook/contacts/l;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/data/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 499
    iput-object p1, p0, Lcom/facebook/contacts/l;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 499
    invoke-direct {p0, p1}, Lcom/facebook/contacts/l;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/data/a;
    .locals 3

    .prologue
    .line 503
    new-instance v2, Lcom/facebook/contacts/data/a;

    const-class v0, Landroid/content/res/Resources;

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    const-class v1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-virtual {p0, v1}, Lcom/facebook/contacts/l;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v2, v0, v1}, Lcom/facebook/contacts/data/a;-><init>(Landroid/content/res/Resources;Lcom/fasterxml/jackson/databind/ObjectMapper;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 499
    invoke-virtual {p0}, Lcom/facebook/contacts/l;->a()Lcom/facebook/contacts/data/a;

    move-result-object v0

    return-object v0
.end method
