.class public Lcom/arist/entity/Skin;
.super Ljava/lang/Object;
.source "Skin.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private des:Ljava/lang/String;

.field private resId:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDes()Ljava/lang/String;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/arist/entity/Skin;->des:Ljava/lang/String;

    return-object v0
.end method

.method public getResId()I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/arist/entity/Skin;->resId:I

    return v0
.end method

.method public setDes(Ljava/lang/String;)V
    .locals 0
    .param p1, "des"    # Ljava/lang/String;

    .prologue
    .line 23
    iput-object p1, p0, Lcom/arist/entity/Skin;->des:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public setResId(I)V
    .locals 0
    .param p1, "resId"    # I

    .prologue
    .line 17
    iput p1, p0, Lcom/arist/entity/Skin;->resId:I

    .line 18
    return-void
.end method
