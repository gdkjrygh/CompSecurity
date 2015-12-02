.class public Lcom/facebook/contacts/picker/r;
.super Ljava/lang/Object;
.source "ContactPickerHeaderViewManager.java"


# instance fields
.field private final a:Landroid/view/ViewGroup;

.field private b:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/facebook/contacts/picker/p;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/facebook/contacts/picker/q;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/contacts/picker/r;->a:Landroid/view/ViewGroup;

    .line 21
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/facebook/contacts/picker/r;->b:Ljava/util/LinkedList;

    .line 22
    new-instance v0, Lcom/facebook/contacts/picker/s;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/picker/s;-><init>(Lcom/facebook/contacts/picker/r;)V

    iput-object v0, p0, Lcom/facebook/contacts/picker/r;->c:Lcom/facebook/contacts/picker/q;

    .line 28
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/contacts/picker/r;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 49
    iget-object v0, p0, Lcom/facebook/contacts/picker/r;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/p;

    .line 50
    invoke-interface {v0}, Lcom/facebook/contacts/picker/p;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 51
    iget-object v1, p0, Lcom/facebook/contacts/picker/r;->a:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/facebook/contacts/picker/r;->c:Lcom/facebook/contacts/picker/q;

    invoke-interface {v0, v1, v2}, Lcom/facebook/contacts/picker/p;->a(Landroid/view/ViewGroup;Lcom/facebook/contacts/picker/q;)V

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/picker/r;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 55
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/picker/r;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Lcom/facebook/contacts/picker/r;->a()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/picker/p;)V
    .locals 2

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/contacts/picker/r;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    .line 38
    iget-object v1, p0, Lcom/facebook/contacts/picker/r;->b:Ljava/util/LinkedList;

    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 39
    if-nez v0, :cond_0

    .line 40
    invoke-direct {p0}, Lcom/facebook/contacts/picker/r;->a()V

    .line 42
    :cond_0
    return-void
.end method
