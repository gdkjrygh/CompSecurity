.class public Lcom/hmobile/common/AppComparators;
.super Ljava/lang/Object;
.source "AppComparators.java"


# static fields
.field private static _instance:Lcom/hmobile/common/AppComparators;


# instance fields
.field public ComparatorMostLike:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;"
        }
    .end annotation
.end field

.field public ComparatorMostShare:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const/4 v0, 0x0

    sput-object v0, Lcom/hmobile/common/AppComparators;->_instance:Lcom/hmobile/common/AppComparators;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Lcom/hmobile/common/AppComparators$1;

    invoke-direct {v0, p0}, Lcom/hmobile/common/AppComparators$1;-><init>(Lcom/hmobile/common/AppComparators;)V

    iput-object v0, p0, Lcom/hmobile/common/AppComparators;->ComparatorMostLike:Ljava/util/Comparator;

    .line 40
    new-instance v0, Lcom/hmobile/common/AppComparators$2;

    invoke-direct {v0, p0}, Lcom/hmobile/common/AppComparators$2;-><init>(Lcom/hmobile/common/AppComparators;)V

    iput-object v0, p0, Lcom/hmobile/common/AppComparators;->ComparatorMostShare:Ljava/util/Comparator;

    .line 15
    return-void
.end method

.method public static Instance()Lcom/hmobile/common/AppComparators;
    .locals 2

    .prologue
    .line 20
    sget-object v0, Lcom/hmobile/common/AppComparators;->_instance:Lcom/hmobile/common/AppComparators;

    if-nez v0, :cond_0

    .line 21
    const-class v1, Lcom/hmobile/common/AppComparators;

    monitor-enter v1

    .line 22
    :try_start_0
    new-instance v0, Lcom/hmobile/common/AppComparators;

    invoke-direct {v0}, Lcom/hmobile/common/AppComparators;-><init>()V

    sput-object v0, Lcom/hmobile/common/AppComparators;->_instance:Lcom/hmobile/common/AppComparators;

    .line 21
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :cond_0
    sget-object v0, Lcom/hmobile/common/AppComparators;->_instance:Lcom/hmobile/common/AppComparators;

    return-object v0

    .line 21
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
