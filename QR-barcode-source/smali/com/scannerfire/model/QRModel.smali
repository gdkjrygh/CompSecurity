.class public Lcom/scannerfire/model/QRModel;
.super Ljava/lang/Object;
.source "QRModel.java"


# instance fields
.field private date:Ljava/lang/String;

.field private id:I

.field private result:Lcom/google/zxing/Result;

.field private time:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    return-void
.end method

.method public constructor <init>(ILcom/google/zxing/Result;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "id"    # I
    .param p2, "result"    # Lcom/google/zxing/Result;
    .param p3, "time"    # Ljava/lang/String;
    .param p4, "date"    # Ljava/lang/String;

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, Lcom/scannerfire/model/QRModel;->id:I

    .line 20
    iput-object p2, p0, Lcom/scannerfire/model/QRModel;->result:Lcom/google/zxing/Result;

    .line 21
    iput-object p3, p0, Lcom/scannerfire/model/QRModel;->time:Ljava/lang/String;

    .line 22
    iput-object p4, p0, Lcom/scannerfire/model/QRModel;->date:Ljava/lang/String;

    .line 23
    return-void
.end method


# virtual methods
.method public getDate()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/scannerfire/model/QRModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/scannerfire/model/QRModel;->id:I

    return v0
.end method

.method public getResult()Lcom/google/zxing/Result;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/scannerfire/model/QRModel;->result:Lcom/google/zxing/Result;

    return-object v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/scannerfire/model/QRModel;->time:Ljava/lang/String;

    return-object v0
.end method

.method public setDate(Ljava/lang/String;)V
    .locals 0
    .param p1, "date"    # Ljava/lang/String;

    .prologue
    .line 54
    iput-object p1, p0, Lcom/scannerfire/model/QRModel;->date:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setId(I)V
    .locals 0
    .param p1, "id"    # I

    .prologue
    .line 30
    iput p1, p0, Lcom/scannerfire/model/QRModel;->id:I

    .line 31
    return-void
.end method

.method public setResult(Lcom/google/zxing/Result;)V
    .locals 0
    .param p1, "result"    # Lcom/google/zxing/Result;

    .prologue
    .line 38
    iput-object p1, p0, Lcom/scannerfire/model/QRModel;->result:Lcom/google/zxing/Result;

    .line 39
    return-void
.end method

.method public setTime(Ljava/lang/String;)V
    .locals 0
    .param p1, "time"    # Ljava/lang/String;

    .prologue
    .line 46
    iput-object p1, p0, Lcom/scannerfire/model/QRModel;->time:Ljava/lang/String;

    .line 47
    return-void
.end method
