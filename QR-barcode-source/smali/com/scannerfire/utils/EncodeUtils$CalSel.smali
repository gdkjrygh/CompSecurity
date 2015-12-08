.class public Lcom/scannerfire/utils/EncodeUtils$CalSel;
.super Ljava/lang/Object;
.source "EncodeUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scannerfire/utils/EncodeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "CalSel"
.end annotation


# instance fields
.field ID:J

.field NAME:Ljava/lang/String;

.field final synthetic this$0:Lcom/scannerfire/utils/EncodeUtils;


# direct methods
.method public constructor <init>(Lcom/scannerfire/utils/EncodeUtils;JLjava/lang/String;)V
    .locals 0
    .param p2, "Id"    # J
    .param p4, "Name"    # Ljava/lang/String;

    .prologue
    .line 339
    iput-object p1, p0, Lcom/scannerfire/utils/EncodeUtils$CalSel;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 340
    iput-wide p2, p0, Lcom/scannerfire/utils/EncodeUtils$CalSel;->ID:J

    .line 341
    iput-object p4, p0, Lcom/scannerfire/utils/EncodeUtils$CalSel;->NAME:Ljava/lang/String;

    .line 342
    return-void
.end method


# virtual methods
.method public getId()J
    .locals 2

    .prologue
    .line 345
    iget-wide v0, p0, Lcom/scannerfire/utils/EncodeUtils$CalSel;->ID:J

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 349
    iget-object v0, p0, Lcom/scannerfire/utils/EncodeUtils$CalSel;->NAME:Ljava/lang/String;

    return-object v0
.end method
