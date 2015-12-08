.class public Lcom/aetn/history/android/historyhere/model/Asset;
.super Ljava/lang/Object;
.source "Asset.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private body:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBody()Ljava/lang/String;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/Asset;->body:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 15
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/Asset;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/Asset;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/Asset;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setBody(Ljava/lang/String;)V
    .locals 0
    .param p1, "body"    # Ljava/lang/String;

    .prologue
    .line 43
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/Asset;->body:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    .line 19
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/Asset;->id:Ljava/lang/String;

    .line 20
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 27
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/Asset;->title:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    .line 35
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/Asset;->type:Ljava/lang/String;

    .line 36
    return-void
.end method
