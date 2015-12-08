.class Lcom/worklight/common/WLPreferences$2$1;
.super Ljava/lang/Object;
.source "WLPreferences.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/worklight/common/WLPreferences$2;->onPreferenceChange(Landroid/preference/Preference;Ljava/lang/Object;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/worklight/common/WLPreferences$2;


# direct methods
.method constructor <init>(Lcom/worklight/common/WLPreferences$2;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/worklight/common/WLPreferences$2$1;->this$1:Lcom/worklight/common/WLPreferences$2;

    .line 264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 270
    return-void
.end method
