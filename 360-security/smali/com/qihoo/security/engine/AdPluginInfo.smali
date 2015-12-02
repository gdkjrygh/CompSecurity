.class public Lcom/qihoo/security/engine/AdPluginInfo;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;
    }
.end annotation


# static fields
.field public static final COPYRIGHT_ILLEGAL:I = 0x2

.field public static final COPYRIGHT_OFFCIAL:I = 0x1

.field public static final COPYRIGHT_UNKNOWN:I = 0x0

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/qihoo/security/engine/AdPluginInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static final SIGNVALUE_COMMONPLUGIN:I = 0x0

.field public static final SIGNVALUE_DANGERPLUGIN:I = 0x1


# instance fields
.field public AdAllRisk:I

.field public AdAllType:I

.field public AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

.field public AdSignValue:I

.field public CopyRightFlags:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/qihoo/security/engine/AdPluginInfo$1;

    invoke-direct {v0}, Lcom/qihoo/security/engine/AdPluginInfo$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/engine/AdPluginInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllRisk:I

    iput v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllType:I

    iput v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdSignValue:I

    iput v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->CopyRightFlags:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllType:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllRisk:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdSignValue:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->CopyRightFlags:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    iput-object v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    :cond_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdAllRisk:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdSignValue:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->CopyRightFlags:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    array-length v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/AdPluginInfo;->AdPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0
.end method
