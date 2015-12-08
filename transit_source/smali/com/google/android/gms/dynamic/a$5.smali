.class Lcom/google/android/gms/dynamic/a$5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/dynamic/a;->a(Landroid/widget/FrameLayout;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic gO:Landroid/content/Context;

.field final synthetic lZ:Lcom/google/android/gms/dynamic/a;

.field final synthetic mg:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/dynamic/a;Landroid/content/Context;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/dynamic/a$5;->lZ:Lcom/google/android/gms/dynamic/a;

    iput-object p2, p0, Lcom/google/android/gms/dynamic/a$5;->gO:Landroid/content/Context;

    iput p3, p0, Lcom/google/android/gms/dynamic/a$5;->mg:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .local p0, "this":Lcom/google/android/gms/dynamic/a$5;, "Lcom/google/android/gms/dynamic/a.5;"
    iget-object v0, p0, Lcom/google/android/gms/dynamic/a$5;->gO:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/dynamic/a$5;->gO:Landroid/content/Context;

    iget v2, p0, Lcom/google/android/gms/dynamic/a$5;->mg:I

    const/4 v3, -0x1

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->a(Landroid/content/Context;II)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
