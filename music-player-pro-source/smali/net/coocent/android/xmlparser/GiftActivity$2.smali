.class Lnet/coocent/android/xmlparser/GiftActivity$2;
.super Ljava/lang/Object;
.source "GiftActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/coocent/android/xmlparser/GiftActivity;->findView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/coocent/android/xmlparser/GiftActivity;


# direct methods
.method constructor <init>(Lnet/coocent/android/xmlparser/GiftActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lnet/coocent/android/xmlparser/GiftActivity$2;->this$0:Lnet/coocent/android/xmlparser/GiftActivity;

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 73
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftActivity$2;->this$0:Lnet/coocent/android/xmlparser/GiftActivity;

    invoke-virtual {v0}, Lnet/coocent/android/xmlparser/GiftActivity;->finish()V

    .line 74
    return-void
.end method
