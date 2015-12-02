.class public Lcom/facebook/contacts/picker/aj;
.super Ljava/lang/Object;
.source "ContactPickerUserRowBuilder.java"


# instance fields
.field private a:Lcom/facebook/user/UserWithIdentifier;

.field private b:Lcom/facebook/contacts/picker/ai;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:I

.field private i:Lcom/facebook/user/ChatContext;

.field private j:Lcom/facebook/contacts/picker/ah;

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    sget-object v0, Lcom/facebook/contacts/picker/ah;->UNKNOWN:Lcom/facebook/contacts/picker/ah;

    iput-object v0, p0, Lcom/facebook/contacts/picker/aj;->j:Lcom/facebook/contacts/picker/ah;

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/contacts/picker/ag;
    .locals 1

    .prologue
    .line 33
    new-instance v0, Lcom/facebook/contacts/picker/ag;

    invoke-direct {v0, p0}, Lcom/facebook/contacts/picker/ag;-><init>(Lcom/facebook/contacts/picker/aj;)V

    return-object v0
.end method

.method public a(I)Lcom/facebook/contacts/picker/aj;
    .locals 0

    .prologue
    .line 91
    iput p1, p0, Lcom/facebook/contacts/picker/aj;->h:I

    .line 92
    return-object p0
.end method

.method public a(Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/aj;
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/facebook/contacts/picker/aj;->j:Lcom/facebook/contacts/picker/ah;

    .line 111
    return-object p0
.end method

.method public a(Lcom/facebook/contacts/picker/ai;)Lcom/facebook/contacts/picker/aj;
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/contacts/picker/aj;->b:Lcom/facebook/contacts/picker/ai;

    .line 47
    return-object p0
.end method

.method public a(Lcom/facebook/user/ChatContext;)Lcom/facebook/contacts/picker/aj;
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/facebook/contacts/picker/aj;->i:Lcom/facebook/user/ChatContext;

    .line 101
    return-object p0
.end method

.method public a(Lcom/facebook/user/UserWithIdentifier;)Lcom/facebook/contacts/picker/aj;
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/facebook/contacts/picker/aj;->a:Lcom/facebook/user/UserWithIdentifier;

    .line 38
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/contacts/picker/aj;
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/facebook/contacts/picker/aj;->f:Ljava/lang/String;

    .line 83
    return-object p0
.end method

.method public a(Z)Lcom/facebook/contacts/picker/aj;
    .locals 0

    .prologue
    .line 55
    iput-boolean p1, p0, Lcom/facebook/contacts/picker/aj;->c:Z

    .line 56
    return-object p0
.end method

.method public b(Z)Lcom/facebook/contacts/picker/aj;
    .locals 0

    .prologue
    .line 64
    iput-boolean p1, p0, Lcom/facebook/contacts/picker/aj;->d:Z

    .line 65
    return-object p0
.end method

.method public b()Lcom/facebook/user/UserWithIdentifier;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/contacts/picker/aj;->a:Lcom/facebook/user/UserWithIdentifier;

    return-object v0
.end method

.method public c()Lcom/facebook/contacts/picker/ai;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/contacts/picker/aj;->b:Lcom/facebook/contacts/picker/ai;

    return-object v0
.end method

.method public c(Z)Lcom/facebook/contacts/picker/aj;
    .locals 0

    .prologue
    .line 73
    iput-boolean p1, p0, Lcom/facebook/contacts/picker/aj;->e:Z

    .line 74
    return-object p0
.end method

.method public d(Z)Lcom/facebook/contacts/picker/aj;
    .locals 0

    .prologue
    .line 119
    iput-boolean p1, p0, Lcom/facebook/contacts/picker/aj;->g:Z

    .line 120
    return-object p0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/facebook/contacts/picker/aj;->c:Z

    return v0
.end method

.method public e(Z)Lcom/facebook/contacts/picker/aj;
    .locals 0

    .prologue
    .line 128
    iput-boolean p1, p0, Lcom/facebook/contacts/picker/aj;->k:Z

    .line 129
    return-object p0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 69
    iget-boolean v0, p0, Lcom/facebook/contacts/picker/aj;->d:Z

    return v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 78
    iget-boolean v0, p0, Lcom/facebook/contacts/picker/aj;->e:Z

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/contacts/picker/aj;->f:Ljava/lang/String;

    return-object v0
.end method

.method public h()I
    .locals 1

    .prologue
    .line 96
    iget v0, p0, Lcom/facebook/contacts/picker/aj;->h:I

    return v0
.end method

.method public i()Lcom/facebook/user/ChatContext;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/contacts/picker/aj;->i:Lcom/facebook/user/ChatContext;

    return-object v0
.end method

.method public j()Lcom/facebook/contacts/picker/ah;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/contacts/picker/aj;->j:Lcom/facebook/contacts/picker/ah;

    return-object v0
.end method

.method public k()Z
    .locals 1

    .prologue
    .line 124
    iget-boolean v0, p0, Lcom/facebook/contacts/picker/aj;->g:Z

    return v0
.end method

.method public l()Z
    .locals 1

    .prologue
    .line 133
    iget-boolean v0, p0, Lcom/facebook/contacts/picker/aj;->k:Z

    return v0
.end method
