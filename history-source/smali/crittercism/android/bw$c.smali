.class public final Lcrittercism/android/bw$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcrittercism/android/bv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcrittercism/android/bw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcrittercism/android/bw$c;->a:Ljava/lang/String;

    .line 86
    invoke-static {}, Lcrittercism/android/bw;->a()Lcrittercism/android/at;

    .line 87
    invoke-static {}, Lcrittercism/android/bw;->a()Lcrittercism/android/at;

    move-result-object v0

    iget-object v0, v0, Lcrittercism/android/at;->a:Ljava/lang/String;

    iput-object v0, p0, Lcrittercism/android/bw$c;->a:Ljava/lang/String;

    .line 88
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 91
    const-string v0, "app_version"

    return-object v0
.end method

.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcrittercism/android/bw$c;->a:Ljava/lang/String;

    return-object v0
.end method
