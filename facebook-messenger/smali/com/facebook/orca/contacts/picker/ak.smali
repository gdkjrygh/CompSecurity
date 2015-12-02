.class public Lcom/facebook/orca/contacts/picker/ak;
.super Lcom/facebook/inject/c;
.source "ContactPickerListAdapterModule.java"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ak;->a:Ljava/lang/Class;

    .line 31
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/picker/ak;)Ljava/lang/Class;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ak;->a:Ljava/lang/Class;

    return-object v0
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 35
    const-class v0, Lcom/facebook/contacts/picker/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ak;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ak;->a:Ljava/lang/Class;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/contacts/picker/am;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/contacts/picker/am;-><init>(Lcom/facebook/orca/contacts/picker/ak;Lcom/facebook/orca/contacts/picker/al;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 38
    return-void
.end method
