.class Lcom/facebook/contacts/al;
.super Lcom/facebook/inject/d;
.source "ContactsLibModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/contacts/c/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/contacts/a;


# direct methods
.method private constructor <init>(Lcom/facebook/contacts/a;)V
    .locals 0

    .prologue
    .line 428
    iput-object p1, p0, Lcom/facebook/contacts/al;->a:Lcom/facebook/contacts/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/contacts/a;Lcom/facebook/contacts/b;)V
    .locals 0

    .prologue
    .line 428
    invoke-direct {p0, p1}, Lcom/facebook/contacts/al;-><init>(Lcom/facebook/contacts/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/c/d;
    .locals 3

    .prologue
    .line 433
    new-instance v1, Lcom/facebook/contacts/c/d;

    const-class v0, Lcom/facebook/contacts/c/b;

    const-class v2, Lcom/facebook/contacts/annotations/ForContactSummary;

    invoke-virtual {p0, v0, v2}, Lcom/facebook/contacts/al;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/c/b;

    const-class v2, Lcom/facebook/contacts/models/a/b;

    invoke-virtual {p0, v2}, Lcom/facebook/contacts/al;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/facebook/contacts/c/d;-><init>(Lcom/facebook/contacts/c/b;Ljava/util/Set;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 428
    invoke-virtual {p0}, Lcom/facebook/contacts/al;->a()Lcom/facebook/contacts/c/d;

    move-result-object v0

    return-object v0
.end method
