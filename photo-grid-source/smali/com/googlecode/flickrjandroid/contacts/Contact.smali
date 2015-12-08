.class public Lcom/googlecode/flickrjandroid/contacts/Contact;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/flickrjandroid/util/BuddyIconable;


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private family:Z

.field private friend:Z

.field private iconFarm:I

.field private iconServer:I

.field private id:Ljava/lang/String;

.field private ignored:Z

.field private location:Ljava/lang/String;

.field private pathAlias:Ljava/lang/String;

.field private realName:Ljava/lang/String;

.field private username:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method


# virtual methods
.method public getBuddyIconUrl()Ljava/lang/String;
    .locals 3

    .prologue
    .line 91
    iget v0, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->iconFarm:I

    iget v1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->iconServer:I

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->createBuddyIconUrl(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getIconFarm()I
    .locals 1

    .prologue
    .line 95
    iget v0, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->iconFarm:I

    return v0
.end method

.method public getIconServer()I
    .locals 1

    .prologue
    .line 107
    iget v0, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->iconServer:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLocation()Ljava/lang/String;
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->location:Ljava/lang/String;

    return-object v0
.end method

.method public getPathAlias()Ljava/lang/String;
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->pathAlias:Ljava/lang/String;

    return-object v0
.end method

.method public getRealName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->realName:Ljava/lang/String;

    return-object v0
.end method

.method public getUsername()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->username:Ljava/lang/String;

    return-object v0
.end method

.method public isFamily()Z
    .locals 1

    .prologue
    .line 66
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->family:Z

    return v0
.end method

.method public isFriend()Z
    .locals 1

    .prologue
    .line 58
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->friend:Z

    return v0
.end method

.method public isIgnored()Z
    .locals 1

    .prologue
    .line 74
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->ignored:Z

    return v0
.end method

.method public setFamily(Z)V
    .locals 0

    .prologue
    .line 70
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->family:Z

    .line 71
    return-void
.end method

.method public setFriend(Z)V
    .locals 0

    .prologue
    .line 62
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->friend:Z

    .line 63
    return-void
.end method

.method public setIconFarm(I)V
    .locals 0

    .prologue
    .line 99
    iput p1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->iconFarm:I

    .line 100
    return-void
.end method

.method public setIconFarm(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 103
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/contacts/Contact;->setIconFarm(I)V

    .line 104
    return-void
.end method

.method public setIconServer(I)V
    .locals 0

    .prologue
    .line 111
    iput p1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->iconServer:I

    .line 112
    return-void
.end method

.method public setIconServer(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 115
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/contacts/Contact;->setIconServer(I)V

    .line 116
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->id:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public setIgnored(Z)V
    .locals 0

    .prologue
    .line 78
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->ignored:Z

    .line 79
    return-void
.end method

.method public setLocation(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->location:Ljava/lang/String;

    .line 144
    return-void
.end method

.method public setPathAlias(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->pathAlias:Ljava/lang/String;

    .line 130
    return-void
.end method

.method public setRealName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 54
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->realName:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setUsername(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->username:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Contact [id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", username="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->username:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", realName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 152
    iget-object v1, p0, Lcom/googlecode/flickrjandroid/contacts/Contact;->realName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 151
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
