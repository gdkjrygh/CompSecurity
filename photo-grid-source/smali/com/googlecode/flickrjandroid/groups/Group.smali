.class public Lcom/googlecode/flickrjandroid/groups/Group;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/flickrjandroid/util/BuddyIconable;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private admin:Z

.field private chatId:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private eighteenPlus:Z

.field private iconFarm:I

.field private iconServer:I

.field private id:Ljava/lang/String;

.field private inChat:I

.field private invitationOnly:Z

.field private lang:Ljava/lang/String;

.field private members:I

.field private name:Ljava/lang/String;

.field private online:I

.field private photoCount:I

.field private poolModerated:Z

.field private privacy:Ljava/lang/String;

.field private rules:Ljava/lang/String;

.field private throttle:Lcom/googlecode/flickrjandroid/groups/Throttle;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    return-void
.end method


# virtual methods
.method public getBuddyIconUrl()Ljava/lang/String;
    .locals 3

    .prologue
    .line 295
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->iconFarm:I

    iget v1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->iconServer:I

    iget-object v2, p0, Lcom/googlecode/flickrjandroid/groups/Group;->id:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/googlecode/flickrjandroid/util/UrlUtilities;->createBuddyIconUrl(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getChatId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->chatId:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getIconFarm()I
    .locals 1

    .prologue
    .line 258
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->iconFarm:I

    return v0
.end method

.method public getIconServer()I
    .locals 1

    .prologue
    .line 272
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->iconServer:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getInChat()I
    .locals 1

    .prologue
    .line 132
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->inChat:I

    return v0
.end method

.method public getLang()Ljava/lang/String;
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->lang:Ljava/lang/String;

    return-object v0
.end method

.method public getMembers()I
    .locals 1

    .prologue
    .line 62
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->members:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOnline()I
    .locals 1

    .prologue
    .line 85
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->online:I

    return v0
.end method

.method public getPhotoCount()I
    .locals 1

    .prologue
    .line 176
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->photoCount:I

    return v0
.end method

.method public getPrivacy()Ljava/lang/String;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->privacy:Ljava/lang/String;

    return-object v0
.end method

.method public getRules()Ljava/lang/String;
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->rules:Ljava/lang/String;

    return-object v0
.end method

.method public getThrottle()Lcom/googlecode/flickrjandroid/groups/Throttle;
    .locals 1

    .prologue
    .line 299
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->throttle:Lcom/googlecode/flickrjandroid/groups/Throttle;

    return-object v0
.end method

.method public isAdmin()Z
    .locals 1

    .prologue
    .line 168
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->admin:Z

    return v0
.end method

.method public isEighteenPlus()Z
    .locals 1

    .prologue
    .line 209
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->eighteenPlus:Z

    return v0
.end method

.method public isInvitationOnly()Z
    .locals 1

    .prologue
    .line 223
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->invitationOnly:Z

    return v0
.end method

.method public isPoolModerated()Z
    .locals 1

    .prologue
    .line 250
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/groups/Group;->poolModerated:Z

    return v0
.end method

.method public setAdmin(Z)V
    .locals 0

    .prologue
    .line 172
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->admin:Z

    .line 173
    return-void
.end method

.method public setChatId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->chatId:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 238
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->description:Ljava/lang/String;

    .line 239
    return-void
.end method

.method public setEighteenPlus(Z)V
    .locals 0

    .prologue
    .line 216
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->eighteenPlus:Z

    .line 217
    return-void
.end method

.method public setIconFarm(I)V
    .locals 0

    .prologue
    .line 262
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->iconFarm:I

    .line 263
    return-void
.end method

.method public setIconFarm(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 266
    if-eqz p1, :cond_0

    .line 267
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/Group;->setIconFarm(I)V

    .line 269
    :cond_0
    return-void
.end method

.method public setIconServer(I)V
    .locals 0

    .prologue
    .line 276
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->iconServer:I

    .line 277
    return-void
.end method

.method public setIconServer(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 280
    if-eqz p1, :cond_0

    .line 281
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/Group;->setIconServer(I)V

    .line 283
    :cond_0
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->id:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public setInChat(I)V
    .locals 0

    .prologue
    .line 140
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->inChat:I

    .line 141
    return-void
.end method

.method public setInChat(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 149
    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/Group;->setInChat(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    :cond_0
    :goto_0
    return-void

    .line 151
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/Group;->setInChat(I)V

    .line 152
    sget-boolean v0, Lcom/googlecode/flickrjandroid/Flickr;->tracing:Z

    if-eqz v0, :cond_0

    .line 153
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "trace: Group.setInChat(String) encountered a number format exception.  InChat set to 0"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setInvitationOnly(Z)V
    .locals 0

    .prologue
    .line 230
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->invitationOnly:Z

    .line 231
    return-void
.end method

.method public setLang(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 246
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->lang:Ljava/lang/String;

    .line 247
    return-void
.end method

.method public setMembers(I)V
    .locals 0

    .prologue
    .line 66
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->members:I

    .line 67
    return-void
.end method

.method public setMembers(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 71
    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/Group;->setMembers(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    :cond_0
    :goto_0
    return-void

    .line 73
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/Group;->setMembers(I)V

    .line 74
    sget-boolean v0, Lcom/googlecode/flickrjandroid/Flickr;->tracing:Z

    if-eqz v0, :cond_0

    .line 75
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "trace: Group.setMembers(String) encountered a number format exception.  members set to 0"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->name:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public setOnline(I)V
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->online:I

    .line 94
    return-void
.end method

.method public setOnline(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 102
    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/Group;->setOnline(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :cond_0
    :goto_0
    return-void

    .line 104
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/Group;->setOnline(I)V

    .line 105
    sget-boolean v0, Lcom/googlecode/flickrjandroid/Flickr;->tracing:Z

    if-eqz v0, :cond_0

    .line 106
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "trace: Group.setOnline(String) encountered a number format exception.  online set to 0"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setPhotoCount(I)V
    .locals 0

    .prologue
    .line 184
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->photoCount:I

    .line 185
    return-void
.end method

.method public setPhotoCount(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 192
    if-eqz p1, :cond_0

    .line 194
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/Group;->setPhotoCount(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    :cond_0
    :goto_0
    return-void

    .line 196
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/groups/Group;->setPhotoCount(I)V

    .line 197
    sget-boolean v0, Lcom/googlecode/flickrjandroid/Flickr;->tracing:Z

    if-eqz v0, :cond_0

    .line 198
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, "trace: Group.setPhotoCount(String) encountered a number format exception.  PhotoCount set to 0"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setPoolModerated(Z)V
    .locals 0

    .prologue
    .line 254
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->poolModerated:Z

    .line 255
    return-void
.end method

.method public setPrivacy(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->privacy:Ljava/lang/String;

    .line 165
    return-void
.end method

.method public setRules(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 311
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->rules:Ljava/lang/String;

    .line 312
    return-void
.end method

.method public setThrottle(Lcom/googlecode/flickrjandroid/groups/Throttle;)V
    .locals 0

    .prologue
    .line 303
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Group;->throttle:Lcom/googlecode/flickrjandroid/groups/Throttle;

    .line 304
    return-void
.end method
