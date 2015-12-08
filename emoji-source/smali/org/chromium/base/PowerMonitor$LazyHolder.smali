.class Lorg/chromium/base/PowerMonitor$LazyHolder;
.super Ljava/lang/Object;
.source "PowerMonitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/PowerMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LazyHolder"
.end annotation


# static fields
.field private static final INSTANCE:Lorg/chromium/base/PowerMonitor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 22
    new-instance v0, Lorg/chromium/base/PowerMonitor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/chromium/base/PowerMonitor;-><init>(Lorg/chromium/base/PowerMonitor$1;)V

    sput-object v0, Lorg/chromium/base/PowerMonitor$LazyHolder;->INSTANCE:Lorg/chromium/base/PowerMonitor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$200()Lorg/chromium/base/PowerMonitor;
    .locals 1

    .prologue
    .line 21
    sget-object v0, Lorg/chromium/base/PowerMonitor$LazyHolder;->INSTANCE:Lorg/chromium/base/PowerMonitor;

    return-object v0
.end method
