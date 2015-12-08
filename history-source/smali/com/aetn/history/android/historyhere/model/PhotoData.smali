.class public Lcom/aetn/history/android/historyhere/model/PhotoData;
.super Ljava/lang/Object;
.source "PhotoData.java"


# instance fields
.field public photoCredit:Ljava/lang/String;

.field public photoURL:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PhotoData;->photoURL:Ljava/lang/String;

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PhotoData;->photoCredit:Ljava/lang/String;

    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "credit"    # Ljava/lang/String;

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PhotoData;->photoURL:Ljava/lang/String;

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/PhotoData;->photoCredit:Ljava/lang/String;

    .line 15
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/PhotoData;->photoURL:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lcom/aetn/history/android/historyhere/model/PhotoData;->photoCredit:Ljava/lang/String;

    .line 17
    return-void
.end method
