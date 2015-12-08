.class public Lcom/googlecode/flickrjandroid/groups/members/Member;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TYPE_ADMIN:Ljava/lang/String; = "4"

.field public static final TYPE_MEMBER:Ljava/lang/String; = "2"

.field public static final TYPE_MODERATOR:Ljava/lang/String; = "3"

.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private iconFarm:I

.field private iconServer:I

.field private id:Ljava/lang/String;

.field private memberType:Ljava/lang/String;

.field private userName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput v0, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->iconFarm:I

    .line 16
    iput v0, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->iconServer:I

    .line 10
    return-void
.end method


# virtual methods
.method public getIconFarm()I
    .locals 1

    .prologue
    .line 40
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->iconFarm:I

    return v0
.end method

.method public getIconServer()I
    .locals 1

    .prologue
    .line 52
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->iconServer:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getMemberType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->memberType:Ljava/lang/String;

    return-object v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public setIconFarm(I)V
    .locals 0

    .prologue
    .line 48
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->iconFarm:I

    .line 49
    return-void
.end method

.method public setIconFarm(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 44
    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/members/Member;->setIconFarm(I)V

    .line 45
    :cond_0
    return-void
.end method

.method public setIconServer(I)V
    .locals 0

    .prologue
    .line 60
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->iconServer:I

    .line 61
    return-void
.end method

.method public setIconServer(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 56
    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/members/Member;->setIconServer(I)V

    .line 57
    :cond_0
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->id:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public setMemberType(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->memberType:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public setUserName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/members/Member;->userName:Ljava/lang/String;

    .line 37
    return-void
.end method
