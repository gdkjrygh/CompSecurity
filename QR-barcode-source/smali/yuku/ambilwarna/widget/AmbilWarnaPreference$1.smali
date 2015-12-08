.class Lyuku/ambilwarna/widget/AmbilWarnaPreference$1;
.super Ljava/lang/Object;
.source "AmbilWarnaPreference.java"

# interfaces
.implements Lyuku/ambilwarna/AmbilWarnaDialog$OnAmbilWarnaListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyuku/ambilwarna/widget/AmbilWarnaPreference;->onClick()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lyuku/ambilwarna/widget/AmbilWarnaPreference;


# direct methods
.method constructor <init>(Lyuku/ambilwarna/widget/AmbilWarnaPreference;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$1;->this$0:Lyuku/ambilwarna/widget/AmbilWarnaPreference;

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Lyuku/ambilwarna/AmbilWarnaDialog;)V
    .locals 0
    .param p1, "dialog"    # Lyuku/ambilwarna/AmbilWarnaDialog;

    .prologue
    .line 48
    return-void
.end method

.method public onOk(Lyuku/ambilwarna/AmbilWarnaDialog;I)V
    .locals 2
    .param p1, "dialog"    # Lyuku/ambilwarna/AmbilWarnaDialog;
    .param p2, "color"    # I

    .prologue
    .line 40
    iget-object v0, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$1;->this$0:Lyuku/ambilwarna/widget/AmbilWarnaPreference;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    # invokes: Lyuku/ambilwarna/widget/AmbilWarnaPreference;->callChangeListener(Ljava/lang/Object;)Z
    invoke-static {v0, v1}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->access$0(Lyuku/ambilwarna/widget/AmbilWarnaPreference;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 44
    :goto_0
    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$1;->this$0:Lyuku/ambilwarna/widget/AmbilWarnaPreference;

    iput p2, v0, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->value:I

    .line 42
    iget-object v0, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$1;->this$0:Lyuku/ambilwarna/widget/AmbilWarnaPreference;

    iget-object v1, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$1;->this$0:Lyuku/ambilwarna/widget/AmbilWarnaPreference;

    iget v1, v1, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->value:I

    # invokes: Lyuku/ambilwarna/widget/AmbilWarnaPreference;->persistInt(I)Z
    invoke-static {v0, v1}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->access$1(Lyuku/ambilwarna/widget/AmbilWarnaPreference;I)Z

    .line 43
    iget-object v0, p0, Lyuku/ambilwarna/widget/AmbilWarnaPreference$1;->this$0:Lyuku/ambilwarna/widget/AmbilWarnaPreference;

    # invokes: Lyuku/ambilwarna/widget/AmbilWarnaPreference;->notifyChanged()V
    invoke-static {v0}, Lyuku/ambilwarna/widget/AmbilWarnaPreference;->access$2(Lyuku/ambilwarna/widget/AmbilWarnaPreference;)V

    goto :goto_0
.end method
