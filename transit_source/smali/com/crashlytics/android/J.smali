.class final Lcom/crashlytics/android/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/io/File;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/E;Ljava/io/File;)V
    .locals 0

    .prologue
    .line 956
    iput-object p2, p0, Lcom/crashlytics/android/J;->a:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 958
    invoke-static {}, Lcom/crashlytics/android/Crashlytics;->getInstance()Lcom/crashlytics/android/Crashlytics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/crashlytics/android/Crashlytics;->s()Lcom/crashlytics/android/ab;

    move-result-object v0

    .line 962
    if-eqz v0, :cond_0

    .line 963
    new-instance v1, Lcom/crashlytics/android/ar;

    invoke-direct {v1, v0}, Lcom/crashlytics/android/ar;-><init>(Lcom/crashlytics/android/ab;)V

    new-instance v0, Lcom/crashlytics/android/aq;

    iget-object v2, p0, Lcom/crashlytics/android/J;->a:Ljava/io/File;

    invoke-static {}, Lcom/crashlytics/android/E;->f()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/crashlytics/android/aq;-><init>(Ljava/io/File;Ljava/util/Map;)V

    invoke-virtual {v1, v0}, Lcom/crashlytics/android/ar;->a(Lcom/crashlytics/android/aq;)Z

    .line 965
    :cond_0
    return-void
.end method
