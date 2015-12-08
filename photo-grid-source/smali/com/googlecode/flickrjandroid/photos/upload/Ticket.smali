.class public Lcom/googlecode/flickrjandroid/photos/upload/Ticket;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final COMPLETED:I = 0x1

.field public static final FAILED:I = 0x2

.field public static final UNCOMPLETED:I


# instance fields
.field private invalid:Z

.field private photoId:Ljava/lang/String;

.field private status:I

.field private ticketId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPhotoId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/upload/Ticket;->photoId:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    .prologue
    .line 52
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/upload/Ticket;->status:I

    return v0
.end method

.method public getTicketId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/upload/Ticket;->ticketId:Ljava/lang/String;

    return-object v0
.end method

.method public hasCompleted()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 60
    iget v1, p0, Lcom/googlecode/flickrjandroid/photos/upload/Ticket;->status:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasFailed()Z
    .locals 2

    .prologue
    .line 64
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/upload/Ticket;->status:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isBusy()Z
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/upload/Ticket;->status:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isInvalid()Z
    .locals 1

    .prologue
    .line 28
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/upload/Ticket;->invalid:Z

    return v0
.end method

.method public setInvalid(Z)V
    .locals 0

    .prologue
    .line 32
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/upload/Ticket;->invalid:Z

    .line 33
    return-void
.end method

.method public setPhotoId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/upload/Ticket;->photoId:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setStatus(I)V
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/upload/Ticket;->status:I

    .line 57
    return-void
.end method

.method public setTicketId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/upload/Ticket;->ticketId:Ljava/lang/String;

    .line 49
    return-void
.end method
