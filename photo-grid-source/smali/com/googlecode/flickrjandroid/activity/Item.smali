.class public Lcom/googlecode/flickrjandroid/activity/Item;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private comments:I

.field private commentsNew:I

.field private commentsOld:I

.field private events:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/activity/Event;",
            ">;"
        }
    .end annotation
.end field

.field private farm:Ljava/lang/String;

.field private faves:I

.field private id:Ljava/lang/String;

.field private more:I

.field private notes:I

.field private notesNew:I

.field private notesOld:I

.field private owner:Ljava/lang/String;

.field private secret:Ljava/lang/String;

.field private server:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private views:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->comments:I

    .line 26
    iput v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->notes:I

    .line 29
    iput v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->commentsOld:I

    .line 30
    iput v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->commentsNew:I

    .line 31
    iput v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->notesOld:I

    .line 32
    iput v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->notesNew:I

    .line 34
    iput v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->views:I

    .line 35
    iput v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->faves:I

    .line 36
    iput v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->more:I

    .line 40
    return-void
.end method


# virtual methods
.method public getComments()I
    .locals 1

    .prologue
    .line 136
    iget v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->comments:I

    return v0
.end method

.method public getCommentsNew()I
    .locals 1

    .prologue
    .line 162
    iget v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->commentsNew:I

    return v0
.end method

.method public getCommentsOld()I
    .locals 1

    .prologue
    .line 175
    iget v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->commentsOld:I

    return v0
.end method

.method public getEvents()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/activity/Event;",
            ">;"
        }
    .end annotation

    .prologue
    .line 123
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->events:Ljava/util/Collection;

    return-object v0
.end method

.method public getFarm()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->farm:Ljava/lang/String;

    return-object v0
.end method

.method public getFaves()I
    .locals 1

    .prologue
    .line 51
    iget v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->faves:I

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getMore()I
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->more:I

    return v0
.end method

.method public getNotes()I
    .locals 1

    .prologue
    .line 149
    iget v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->notes:I

    return v0
.end method

.method public getNotesNew()I
    .locals 1

    .prologue
    .line 188
    iget v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->notesNew:I

    return v0
.end method

.method public getNotesOld()I
    .locals 1

    .prologue
    .line 201
    iget v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->notesOld:I

    return v0
.end method

.method public getOwner()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->owner:Ljava/lang/String;

    return-object v0
.end method

.method public getSecret()Ljava/lang/String;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->secret:Ljava/lang/String;

    return-object v0
.end method

.method public getServer()Ljava/lang/String;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->server:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getViews()I
    .locals 1

    .prologue
    .line 115
    iget v0, p0, Lcom/googlecode/flickrjandroid/activity/Item;->views:I

    return v0
.end method

.method public setComments(I)V
    .locals 0

    .prologue
    .line 140
    iput p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->comments:I

    .line 141
    return-void
.end method

.method public setCommentsNew(I)V
    .locals 0

    .prologue
    .line 166
    iput p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->commentsNew:I

    .line 167
    return-void
.end method

.method public setCommentsOld(I)V
    .locals 0

    .prologue
    .line 179
    iput p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->commentsOld:I

    .line 180
    return-void
.end method

.method public setEvents(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/activity/Event;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 127
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->events:Ljava/util/Collection;

    .line 128
    return-void
.end method

.method public setFarm(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->farm:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setFaves(I)V
    .locals 0

    .prologue
    .line 55
    iput p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->faves:I

    .line 56
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->id:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public setMore(I)V
    .locals 0

    .prologue
    .line 71
    iput p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->more:I

    .line 72
    return-void
.end method

.method public setNotes(I)V
    .locals 0

    .prologue
    .line 153
    iput p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->notes:I

    .line 154
    return-void
.end method

.method public setNotesNew(I)V
    .locals 0

    .prologue
    .line 192
    iput p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->notesNew:I

    .line 193
    return-void
.end method

.method public setNotesOld(I)V
    .locals 0

    .prologue
    .line 205
    iput p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->notesOld:I

    .line 206
    return-void
.end method

.method public setOwner(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->owner:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setSecret(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->secret:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public setServer(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->server:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->title:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->type:Ljava/lang/String;

    .line 112
    return-void
.end method

.method public setViews(I)V
    .locals 0

    .prologue
    .line 119
    iput p1, p0, Lcom/googlecode/flickrjandroid/activity/Item;->views:I

    .line 120
    return-void
.end method
