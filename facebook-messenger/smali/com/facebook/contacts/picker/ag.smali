.class public Lcom/facebook/contacts/picker/ag;
.super Ljava/lang/Object;
.source "ContactPickerUserRow.java"

# interfaces
.implements Lcom/facebook/contacts/picker/ad;


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Lcom/facebook/user/UserWithIdentifier;

.field private final b:Lcom/facebook/contacts/picker/ai;

.field private final c:Z

.field private final d:Z

.field private final e:Z

.field private final f:Ljava/lang/String;

.field private final g:I

.field private final h:Lcom/facebook/user/ChatContext;

.field private final i:Lcom/facebook/contacts/picker/ah;

.field private j:Z

.field private final k:Z


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/picker/aj;)V
    .locals 1

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/aj;->b()Lcom/facebook/user/UserWithIdentifier;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/ag;->a:Lcom/facebook/user/UserWithIdentifier;

    .line 49
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/aj;->c()Lcom/facebook/contacts/picker/ai;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/ag;->b:Lcom/facebook/contacts/picker/ai;

    .line 50
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/aj;->d()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/contacts/picker/ag;->c:Z

    .line 51
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/aj;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/contacts/picker/ag;->d:Z

    .line 52
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/aj;->f()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/contacts/picker/ag;->e:Z

    .line 53
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/aj;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/ag;->f:Ljava/lang/String;

    .line 54
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/aj;->h()I

    move-result v0

    iput v0, p0, Lcom/facebook/contacts/picker/ag;->g:I

    .line 55
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/aj;->i()Lcom/facebook/user/ChatContext;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/ag;->h:Lcom/facebook/user/ChatContext;

    .line 56
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/aj;->j()Lcom/facebook/contacts/picker/ah;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/ag;->i:Lcom/facebook/contacts/picker/ah;

    .line 57
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/aj;->k()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/contacts/picker/ag;->j:Z

    .line 58
    invoke-virtual {p1}, Lcom/facebook/contacts/picker/aj;->l()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/contacts/picker/ag;->k:Z

    .line 59
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/UserWithIdentifier;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/contacts/picker/ag;->a:Lcom/facebook/user/UserWithIdentifier;

    return-object v0
.end method

.method public b()Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/contacts/picker/ag;->a:Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/facebook/contacts/picker/ai;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/contacts/picker/ag;->b:Lcom/facebook/contacts/picker/ai;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 74
    iget-boolean v0, p0, Lcom/facebook/contacts/picker/ag;->c:Z

    return v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 78
    iget-boolean v0, p0, Lcom/facebook/contacts/picker/ag;->d:Z

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/contacts/picker/ag;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    .prologue
    .line 86
    iget v0, p0, Lcom/facebook/contacts/picker/ag;->g:I

    return v0
.end method

.method public h()Lcom/facebook/user/ChatContext;
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/facebook/contacts/picker/ag;->h:Lcom/facebook/user/ChatContext;

    return-object v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 94
    iget-boolean v0, p0, Lcom/facebook/contacts/picker/ag;->e:Z

    return v0
.end method

.method public j()Lcom/facebook/contacts/picker/ah;
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/contacts/picker/ag;->i:Lcom/facebook/contacts/picker/ah;

    return-object v0
.end method

.method public k()Z
    .locals 1

    .prologue
    .line 106
    iget-boolean v0, p0, Lcom/facebook/contacts/picker/ag;->j:Z

    return v0
.end method

.method public l()Z
    .locals 1

    .prologue
    .line 110
    iget-boolean v0, p0, Lcom/facebook/contacts/picker/ag;->k:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    invoke-virtual {p0}, Lcom/facebook/contacts/picker/ag;->b()Lcom/facebook/user/User;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/User;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
