.class public final Lkik/android/scan/fragment/ScanFragment$a;
.super Lcom/kik/ui/fragment/FragmentBase$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/scan/fragment/ScanFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 1044
    invoke-direct {p0}, Lcom/kik/ui/fragment/FragmentBase$a;-><init>()V

    .line 1046
    const-string v0, "scan.fragment.scan.launch.first"

    iput-object v0, p0, Lkik/android/scan/fragment/ScanFragment$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Z)Lkik/android/scan/fragment/ScanFragment$a;
    .locals 1

    .prologue
    .line 1050
    const-string v0, "scan.fragment.scan.launch.first"

    invoke-virtual {p0, v0, p1}, Lkik/android/scan/fragment/ScanFragment$a;->a(Ljava/lang/String;Z)V

    .line 1051
    return-object p0
.end method
