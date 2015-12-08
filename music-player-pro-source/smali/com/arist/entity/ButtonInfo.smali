.class public Lcom/arist/entity/ButtonInfo;
.super Ljava/lang/Object;
.source "ButtonInfo.java"


# instance fields
.field private btnDes:Ljava/lang/String;

.field private btnResId:I

.field private btnTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBtnDes()Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/arist/entity/ButtonInfo;->btnDes:Ljava/lang/String;

    return-object v0
.end method

.method public getBtnResId()I
    .locals 1

    .prologue
    .line 11
    iget v0, p0, Lcom/arist/entity/ButtonInfo;->btnResId:I

    return v0
.end method

.method public getBtnTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 17
    iget-object v0, p0, Lcom/arist/entity/ButtonInfo;->btnTitle:Ljava/lang/String;

    return-object v0
.end method

.method public setBtnDes(Ljava/lang/String;)V
    .locals 0
    .param p1, "btnDes"    # Ljava/lang/String;

    .prologue
    .line 26
    iput-object p1, p0, Lcom/arist/entity/ButtonInfo;->btnDes:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public setBtnResId(I)V
    .locals 0
    .param p1, "btnResId"    # I

    .prologue
    .line 14
    iput p1, p0, Lcom/arist/entity/ButtonInfo;->btnResId:I

    .line 15
    return-void
.end method

.method public setBtnTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "btnTitle"    # Ljava/lang/String;

    .prologue
    .line 20
    iput-object p1, p0, Lcom/arist/entity/ButtonInfo;->btnTitle:Ljava/lang/String;

    .line 21
    return-void
.end method
