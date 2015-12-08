.class public Lcom/hmobile/activerecorbase/ARConst;
.super Ljava/lang/Object;
.source "ARConst.java"


# static fields
.field public static TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 10
    const-string v0, "AR"

    sput-object v0, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
