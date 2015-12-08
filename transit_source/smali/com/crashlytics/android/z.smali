.class final Lcom/crashlytics/android/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Lcom/crashlytics/android/w;


# direct methods
.method constructor <init>(Lcom/crashlytics/android/w;)V
    .locals 0

    .prologue
    .line 735
    iput-object p1, p0, Lcom/crashlytics/android/z;->a:Lcom/crashlytics/android/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    const/4 v1, 0x1

    .line 738
    iget-object v0, p0, Lcom/crashlytics/android/z;->a:Lcom/crashlytics/android/w;

    iget-object v0, v0, Lcom/crashlytics/android/w;->b:Lcom/crashlytics/android/Crashlytics;

    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->a(Z)V

    .line 739
    iget-object v0, p0, Lcom/crashlytics/android/z;->a:Lcom/crashlytics/android/w;

    iget-object v0, v0, Lcom/crashlytics/android/w;->a:Lcom/crashlytics/android/C;

    invoke-virtual {v0, v1}, Lcom/crashlytics/android/C;->a(Z)V

    .line 740
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 741
    return-void
.end method
