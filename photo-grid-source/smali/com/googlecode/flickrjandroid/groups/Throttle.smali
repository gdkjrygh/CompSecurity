.class public Lcom/googlecode/flickrjandroid/groups/Throttle;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private count:I

.field private mode:Ljava/lang/String;

.field private remaining:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/Throttle;->count:I

    return v0
.end method

.method public getMode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/groups/Throttle;->mode:Ljava/lang/String;

    return-object v0
.end method

.method public getRemaining()I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/googlecode/flickrjandroid/groups/Throttle;->remaining:I

    return v0
.end method

.method public setCount(I)V
    .locals 0

    .prologue
    .line 27
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/Throttle;->count:I

    .line 28
    return-void
.end method

.method public setMode(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/groups/Throttle;->mode:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setRemaining(I)V
    .locals 0

    .prologue
    .line 54
    iput p1, p0, Lcom/googlecode/flickrjandroid/groups/Throttle;->remaining:I

    .line 55
    return-void
.end method
