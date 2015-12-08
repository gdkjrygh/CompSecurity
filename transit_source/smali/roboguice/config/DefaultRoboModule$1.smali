.class Lroboguice/config/DefaultRoboModule$1;
.super Lcom/google/inject/TypeLiteral;
.source "DefaultRoboModule.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lroboguice/config/DefaultRoboModule;->configure()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/TypeLiteral",
        "<",
        "Lroboguice/inject/NullProvider",
        "<",
        "Landroid/content/Context;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lroboguice/config/DefaultRoboModule;


# direct methods
.method constructor <init>(Lroboguice/config/DefaultRoboModule;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lroboguice/config/DefaultRoboModule$1;->this$0:Lroboguice/config/DefaultRoboModule;

    invoke-direct {p0}, Lcom/google/inject/TypeLiteral;-><init>()V

    return-void
.end method
