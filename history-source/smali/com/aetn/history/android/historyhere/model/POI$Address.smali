.class public Lcom/aetn/history/android/historyhere/model/POI$Address;
.super Ljava/lang/Object;
.source "POI.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/model/POI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Address"
.end annotation


# instance fields
.field private address1:Ljava/lang/String;

.field private address2:Ljava/lang/String;

.field private city:Ljava/lang/String;

.field private state:Ljava/lang/String;

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/POI;

.field private zip:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/model/POI;)V
    .locals 1
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/POI;

    .prologue
    .line 275
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->this$0:Lcom/aetn/history/android/historyhere/model/POI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 276
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->address1:Ljava/lang/String;

    .line 277
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->address2:Ljava/lang/String;

    .line 278
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->city:Ljava/lang/String;

    .line 279
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->state:Ljava/lang/String;

    .line 280
    const-string v0, ""

    iput-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->zip:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POI$Address;

    .prologue
    .line 275
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->address1:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lcom/aetn/history/android/historyhere/model/POI$Address;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POI$Address;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 275
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->address1:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POI$Address;

    .prologue
    .line 275
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->address2:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$102(Lcom/aetn/history/android/historyhere/model/POI$Address;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POI$Address;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 275
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->address2:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$200(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POI$Address;

    .prologue
    .line 275
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->city:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$202(Lcom/aetn/history/android/historyhere/model/POI$Address;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POI$Address;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 275
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->city:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$300(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POI$Address;

    .prologue
    .line 275
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->state:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$302(Lcom/aetn/history/android/historyhere/model/POI$Address;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POI$Address;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 275
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->state:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$400(Lcom/aetn/history/android/historyhere/model/POI$Address;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POI$Address;

    .prologue
    .line 275
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->zip:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$402(Lcom/aetn/history/android/historyhere/model/POI$Address;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lcom/aetn/history/android/historyhere/model/POI$Address;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 275
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->zip:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public getAddress1()Ljava/lang/String;
    .locals 1

    .prologue
    .line 283
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->address1:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 284
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->address1:Ljava/lang/String;

    .line 286
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public getAddress2()Ljava/lang/String;
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->address2:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->address2:Ljava/lang/String;

    .line 293
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->city:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 298
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->city:Ljava/lang/String;

    .line 300
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public getState()Ljava/lang/String;
    .locals 1

    .prologue
    .line 304
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->state:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 305
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->state:Ljava/lang/String;

    .line 307
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public getZip()Ljava/lang/String;
    .locals 1

    .prologue
    .line 311
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->zip:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 312
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/POI$Address;->zip:Ljava/lang/String;

    .line 314
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method
