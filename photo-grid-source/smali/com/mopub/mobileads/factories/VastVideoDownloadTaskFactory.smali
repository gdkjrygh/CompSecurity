.class public Lcom/mopub/mobileads/factories/VastVideoDownloadTaskFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/mopub/mobileads/factories/VastVideoDownloadTaskFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 6
    new-instance v0, Lcom/mopub/mobileads/factories/VastVideoDownloadTaskFactory;

    invoke-direct {v0}, Lcom/mopub/mobileads/factories/VastVideoDownloadTaskFactory;-><init>()V

    sput-object v0, Lcom/mopub/mobileads/factories/VastVideoDownloadTaskFactory;->a:Lcom/mopub/mobileads/factories/VastVideoDownloadTaskFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Lcom/mopub/mobileads/VastVideoDownloadTask$VastVideoDownloadTaskListener;)Lcom/mopub/mobileads/VastVideoDownloadTask;
    .locals 1

    .prologue
    .line 1018
    new-instance v0, Lcom/mopub/mobileads/VastVideoDownloadTask;

    invoke-direct {v0, p0}, Lcom/mopub/mobileads/VastVideoDownloadTask;-><init>(Lcom/mopub/mobileads/VastVideoDownloadTask$VastVideoDownloadTaskListener;)V

    .line 14
    return-object v0
.end method

.method public static setInstance(Lcom/mopub/mobileads/factories/VastVideoDownloadTaskFactory;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 10
    sput-object p0, Lcom/mopub/mobileads/factories/VastVideoDownloadTaskFactory;->a:Lcom/mopub/mobileads/factories/VastVideoDownloadTaskFactory;

    .line 11
    return-void
.end method
