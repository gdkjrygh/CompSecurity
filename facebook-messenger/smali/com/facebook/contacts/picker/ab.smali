.class Lcom/facebook/contacts/picker/ab;
.super Ljava/lang/Object;
.source "ContactPickerMergedFilter.java"


# instance fields
.field private final a:Lcom/facebook/contacts/picker/u;

.field private final b:Ljava/lang/String;

.field private final c:Z

.field private d:Lcom/facebook/contacts/picker/l;

.field private e:Lcom/facebook/widget/a/j;


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/picker/ac;)V
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    sget-object v0, Lcom/facebook/widget/a/j;->FINISHED:Lcom/facebook/widget/a/j;

    iput-object v0, p0, Lcom/facebook/contacts/picker/ab;->e:Lcom/facebook/widget/a/j;

    .line 67
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/ac;->a()Lcom/facebook/contacts/picker/u;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/ab;->a:Lcom/facebook/contacts/picker/u;

    .line 68
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/ac;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/ab;->b:Ljava/lang/String;

    .line 69
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/ac;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/contacts/picker/ab;->c:Z

    .line 70
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/picker/u;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/contacts/picker/ab;->a:Lcom/facebook/contacts/picker/u;

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/picker/l;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/facebook/contacts/picker/ab;->d:Lcom/facebook/contacts/picker/l;

    .line 86
    return-void
.end method

.method public a(Lcom/facebook/widget/a/j;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/facebook/contacts/picker/ab;->e:Lcom/facebook/widget/a/j;

    .line 94
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/contacts/picker/ab;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/facebook/contacts/picker/l;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/contacts/picker/ab;->d:Lcom/facebook/contacts/picker/l;

    return-object v0
.end method

.method public d()Lcom/facebook/widget/a/j;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/contacts/picker/ab;->e:Lcom/facebook/widget/a/j;

    return-object v0
.end method
