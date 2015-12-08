.class final Lcom/crashlytics/android/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/crashlytics/android/D;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/crashlytics/android/D",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic a:Landroid/content/Context;

.field private synthetic b:Lcom/crashlytics/android/Crashlytics;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/Crashlytics;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 632
    iput-object p1, p0, Lcom/crashlytics/android/t;->b:Lcom/crashlytics/android/Crashlytics;

    iput-object p2, p0, Lcom/crashlytics/android/t;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/crashlytics/android/au;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 632
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/crashlytics/android/t;->a:Landroid/content/Context;

    instance-of v1, v1, Landroid/app/Activity;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/crashlytics/android/t;->b:Lcom/crashlytics/android/Crashlytics;

    invoke-virtual {v1}, Lcom/crashlytics/android/Crashlytics;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/crashlytics/android/t;->b:Lcom/crashlytics/android/Crashlytics;

    iget-object v0, p0, Lcom/crashlytics/android/t;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/crashlytics/android/au;->d()Lcom/crashlytics/android/am;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/crashlytics/android/Crashlytics;->a(Lcom/crashlytics/android/Crashlytics;Landroid/app/Activity;Lcom/crashlytics/android/am;)Z

    move-result v0

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
